public class Animal  implements  Runnable{
    static  int Distace = 100 ;

    int avancement  = 0 ;
    int Speed = 0 ;
    String name ;
     boolean isWeekUp  = false ;
   public  Animal(String name, int Speed )  {
       this.Speed = Speed ;
       this.name = name;

    }

    @Override
    public void run() {
        try {
           while ( avancement <=  100) {
              if (avancement >= 50 && isWeekUp == false  && name == "L"){
                  Thread.sleep(25000);
                  isWeekUp =  true ;
              }
              Thread.sleep(1000);
               this.avancement += Speed;
               System.out.println( name + " : avancer par : " +avancement);

           }
           System.out.println(name+" win");
           System.exit(0);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
