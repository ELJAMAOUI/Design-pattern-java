public class displayAll implements Observer
{
        public void update(Observable obs)
        {
                if(obs instanceof GPS)
                {       
                        GPS gp = (GPS) obs;
                        System.out.println("Position "+gp.getPosition()+" et Pr�cision "+gp.getPrecision());
                }                     
        }
 
}