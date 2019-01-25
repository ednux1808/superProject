package estructurasLineales.listaCircular;

public class ListaCircular {

    NodoListaCircular inicio = null;

    public boolean estaVacia() {
        return inicio == null;
    }

    public int primero(){
        return inicio.getValor();
        }
    public void insertar(int valor) {
        NodoListaCircular nodo = new NodoListaCircular(valor, null);
        if (estaVacia()) {
            this.inicio = nodo;
            nodo.setSig(this.inicio);
        } else {
            if (this.inicio == this.inicio.getSig()) {
                if (nodo.getValor() < this.inicio.getValor()) {
                    this.inicio.setSig(nodo);
                    nodo.setSig(this.inicio);
                    this.inicio = nodo;
                } else {
                    this.inicio.setSig(nodo);
                    nodo.setSig(this.inicio);
                }
            } else {
                if (nodo.getValor() < this.inicio.getValor()) {
                    NodoListaCircular temp = this.inicio;
                    while (temp.getSig() != this.inicio) {
                        temp = temp.getSig();
                    }
                    temp.setSig(nodo);
                    nodo.setSig(this.inicio);
                    this.inicio = nodo;
                } else {
                    NodoListaCircular temp = this.inicio;
                    while (temp.getSig() != this.inicio) {
                        if (nodo.getValor() < temp.getSig().getValor()) {
                            nodo.setSig(temp.getSig());
                            temp.setSig(nodo);
                            break;
                        } else {
                            temp = temp.getSig();
                        }
                    }
                    if (temp.getSig() == this.inicio) {
                        temp.setSig(nodo);
                        nodo.setSig(this.inicio);
                    }
                }
            }
        }

    }

    public String imprimir() {
        String contenido = "";
        if (!estaVacia()) {
            NodoListaCircular temp = this.inicio;
            while (temp.getSig() != this.inicio) {
                contenido += temp.getValor() + ", ";
                temp = temp.getSig();
            }

            contenido += temp.getValor() + ",  ";
            contenido += temp.getSig().getValor();
        }
        return contenido;
    }

    public boolean buscar(int busqueda) {
        if (!estaVacia()) {
            NodoListaCircular buscar = this.inicio;
            while (buscar.getSig() != this.inicio) {
                if (buscar.getValor() == busqueda) {
                    return true;
                }
                buscar = buscar.getSig();
            }
            if (buscar.getValor() == busqueda) {
                return true;
            }

        }
        return false;

    }

    public void eliminar(int Eliminar) {
        if (!estaVacia()) {
            if (this.inicio.getSig() == this.inicio) {
                this.inicio.setSig(null);
                this.inicio = null;
            } else {
                if (Eliminar == this.inicio.getValor()) {
                    NodoListaCircular temp = this.inicio;
                    while (temp.getSig() != this.inicio) {
                        temp = temp.getSig();
                    }
                    temp.setSig(this.inicio.getSig());
                    this.inicio = this.inicio.getSig();
                } else {
                    NodoListaCircular temp = this.inicio;
                    while (temp.getSig() != this.inicio) {
                        if (Eliminar == temp.getSig().getValor()) {
                            temp.setSig(temp.getSig().getSig());
                        } else {
                            temp = temp.getSig();
                        }
                    }
                }
            }
        }

    }
}
