public class Application
{
        public static void main(String[] args)
        {
                GPS gps = new GPS();
                displayResume resume = new displayResume();
                displayAll all = new displayAll();
                gps.addObserver(resume);
                gps.setMesure(20, " 20");
                gps.addObserver(all);
                gps.setMesure(50, " 50");
                gps.removeObserver(all);
                gps.removeObserver(resume);
        }
}