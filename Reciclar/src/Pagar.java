public class Pagar {
    public static void main(String[] args) {
       Catadores catador1 = new Catadores("Maria antonieta");
       Catadores catador2 = new Catadores("Douglas");
       Catadores catador3 = new Catadores("Collor");
   


       Coleta coleta1 =  new Coleta();
   
       coleta1.adicionarItem( "Garrafa PET", "KG", 8.14, 10);
       coleta1.adicionarItem("Latinha", "KG", 10.4, 6);
       coleta1.adicionarItem("Cobre", "KG", 7d,8 );
       coleta1.adicionarCatador(catador1);

       Coleta coleta2 =  new Coleta();
       coleta2.adicionarItem( "Garrafa PET", "KG", 8.14, 15);
       coleta2.adicionarItem("Latinha", "KG", 10.4, 9);
       coleta2.adicionarItem("Cobre", "KG", 7d,3 );
       coleta2.adicionarCatador(catador2);

       Coleta coleta3 =  new Coleta();
       coleta3.adicionarItem( "Garrafa PET", "KG", 8.14, 15);
       coleta3.adicionarItem("Ferro", "KG", 9.2, 5);
       coleta3.adicionarItem("Óleo", "LT", 7d,8 );
       coleta3.adicionarCatador(catador3);
       
  
   
       catador1.adicionarColetas(coleta1); 
       catador2.coleta.add(coleta2);
       catador3.coleta.add(coleta3);

       System.out.println("Total do(a) Catador " + catador1.nomeCatador + " à receber é " + catador1.obterValor());
       System.out.println("Total do(a) Catador " + catador2.nomeCatador + " à receber é " + catador2.obterValor());
       System.out.println("Total do(a) Catador " + catador3.nomeCatador + " à receber é " + catador3.obterValor());

    

    

    }
}
