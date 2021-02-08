/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.utils.JPAUtilsP;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author braya
 * @param <T>
 */
public abstract class ControladorAbstractoP<T> {
    private List<T> listaObjetos;
    private Class<T> clase;
    private EntityManager emP;

    public ControladorAbstractoP() {
        listaObjetos = new ArrayList<>();
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        emP = JPAUtilsP.getEntityManagerP();
    }
    
    public ControladorAbstractoP(EntityManager em) {
        listaObjetos = new ArrayList<>();
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        clase = (Class) pt.getActualTypeArguments()[0];
        this.emP = em;
    }
    
    public T create(T objeto){
        emP.getTransaction().begin();
        emP.persist(objeto);
        emP.getTransaction().commit();
        listaObjetos.add(objeto);
        return objeto;
    }
    
//    public boolean delete(T objeto){
//        emP.getTransaction().begin();
//        emP.remove(emP.merge(objeto));
//        emP.getTransaction().commit();
//        listaObjetos.remove(objeto);
//        return true;
//    }
    
    public T update(T objeto){
        emP.getTransaction().begin();
        objeto = emP.merge(objeto);
        emP.getTransaction().commit();
        this.findAll();
        return objeto;
    }
   
//    public T read(Object id){
//        return (T) emP.find(clase, id);
//    }
    
    public List<T> findAll(){
        return emP.createQuery("Select t from " + clase.getSimpleName() + " t").getResultList();
    }

    public List<T> getListaObjetos() {
        return listaObjetos = emP.createQuery("Select t from " + clase.getSimpleName() + " t").getResultList();
    }

    public void setListaObjetos(List<T> listaObjetos) {
        this.listaObjetos = listaObjetos;
    }

    public Class<T> getClase() {
        return clase;
    }

    public void setClase(Class<T> clase) {
        this.clase = clase;
    }

    public EntityManager getEm() {
        return emP;
    }

    public void setEm(EntityManager em) {
        this.emP = em;
    }
    
    public synchronized void mover(JLabel boton, Thread t, int x, int y) {
//        int xB = boton.getX();
//        int yB = boton.getY();
//        boton.setLocation(597, 468);
        int i;
        for (i = 651; i >= x; i--) {
            try {
                boton.setLocation(i, 468);
                //System.out.println("i == " + i);

                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorAutomovilP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        for (int j = 420; j >= y; j--) {
            try {
                boton.setLocation(i, j);
                //System.out.println("j == " + j);
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorAutomovilP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        t.stop();
    }
}
