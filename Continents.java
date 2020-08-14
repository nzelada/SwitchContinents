public class Continents {
  /*The largest city in that certain continent*/
int continent;
  public Continents(int areas){
  continent = areas;
  }
  public void lookContinents(){
    switch(continent)	{
      case 1:
             System.out.println("North America: Mexico City, Mexico\n"); 
      break;
      case 2:
       System.out.println("South America: Sao Paulo, Brazil\n"); 
      break;
      case 3:
       System.out.println("Europe: Moscow, Russia\n"); 
      break;
      case 4:
       System.out.println("Africa: Lagos, Nigeria\n"); 
      break;
      case 5:
       System.out.println("Asia: Shanghai, China\n"); 
      break;
      case 6:
       System.out.println("Australia: Sydney, Australia\n"); 
      break;
      case 7:
       System.out.println("Antarctica: McMurdo Station, US\n"); 
      break;
      default:
      System.out.println("Undefined continent!\n");   
     }
  }
	public static void main(String[] args) {
    Continents num = new Continents(4);
    num.lookContinents();
    Continents num1 = new Continents(5);
    num1.lookContinents();
    Continents num2 = new Continents(9);
    num2.lookContinents();
	

	}
}
