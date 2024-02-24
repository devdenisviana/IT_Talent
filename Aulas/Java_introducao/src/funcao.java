public class funcao {
   void Hello(){//funcao sem retorno e sem parametros
       System.out.println("Olá, mundo!");
   }

   void Hello(String nome){
       System.out.println("Olá, "+nome+"!");
   }
    public static void main(String[] args) {
        new funcao().Hello();
        new funcao().Hello( nome: "Denis");
    }
}
