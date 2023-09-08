package src.main.java.generics;
/** -- Uso normal
public class javaGenericTypes {
    private Object object;

    public void set(Object object) {this.object = object;}
    public Object get() {return object;}
}
**/


/**
 Versão genérica da classe Box.
 @param <T> o tipo do valor sendo armazenado
 */
public class JavaGenericTypes<T> {
    // T representa "Type" (tipo)
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}