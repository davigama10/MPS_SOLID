public interface Ave_Voadora {
    public void voa();
}
/* 
Aplicou-se o princípio de Separação de Interfaces pois percebeu-se que a classe Pinguim não usa de forma devida a Interface original Ave, devido a um dos métodos que ela possuia originalmente
Optou-se então por criar uma nova interface, modificando-se a original e a implementação delas pelas classes Pinguim e Águia
*/  
