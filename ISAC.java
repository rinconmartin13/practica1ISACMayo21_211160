public class Pila {
    private int pila[];
    private int tope;
    private boolean bandera;
	
    public Pila(int capacidad){ 
	    pila = new int[capacidad];
	    tope = -1;                                     
    } 
    
    public boolean pilaLlena(){
	    if(tope == pila.length-1) //tope==MAX
            bandera=true;//pila llena
        else 
            bandera=false;
        
        return bandera;
    }
    public boolean pilaVacia(){
        if(tope == -1)
            bandera=true;//Pila vacia
        else 
            bandera=false;
        
        return bandera;
    }
    public void agregar(int dato){
        if (pilaLlena())
            System.out.println("Error pila llena, desbordamiento de datos");
        else
            pila[++tope] = dato;
    }
    public int eliminar(){
        if(pilaVacia()){
            System.out.println("Error pila vacia");
            return 0;
        }
        else{
            int dato=pila[tope--];
            return dato;
        }
    }
    public int mostrar(){
        if(pilaVacia())
            return 0;
        else
            return pila[tope];
    }


    //Pila vacía
    /*public boolean isEmpty(){
	    return tope == -1;
    }*/
    //Agregar a la pila
    /*public void push(int i){
	    if(tope+1 < pila.length)
	        pila[++tope] = i;
    }*/
    //Eliminar de la pila
    /*public int pop(){
	    if(isEmpty())
            return 0;
	    return pila[tope--];
	}*/
    //Mostrar ultimo elemento
    /*public int peek(){
		if(isEmpty())
			return 0;
		return pila[tope];
	}*/
}