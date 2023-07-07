import java.util.ArrayList;
import java.util.List;

public class GPS implements Observable
{
        private int position;
        private String precision;
        private List<Observer> observers= new ArrayList<Observer>();
        public GPS()
        {
        }
        
        public void addObserver(Observer obs)
        {
                observers.add(obs); 
        }
        
        public void removeObserver(Observer obs)
        {
                observers.remove(obs);              
        }
        
        public void notifyObservers()
        {
        	for(int i=0;i<observers.size();i++)
            {
                    Observer ob = observers.get(i);
                    ob.update(this);
            }
        }
                  public int getPosition()
         {
                 return position;
         }
         
         public String getPrecision()
         {
                 return precision;
         }
         
        public void setMesure(int position, String precision)
        {
                this.position=position;
                this.precision=precision;
                notifyObservers();
        }
        
}