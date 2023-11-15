package calculator.gui;

public class Logic {
    public String display = "";
    public String resultDisplay = "";

    private int aux = 0;
    private int auxWorker = 0;
    
    // Only work with display
    public void setNumber(String x) { 
        if ("0".equals(x)){
           if (!"".equals(this.display)) this.display += x;
            
        }else {
            this.display += x; 
        }
    }
    public void delNumber(){
        if ("".equals(this.display));
        else {
            this.display = this.display.replaceFirst(".$", "");
        }
    }
    
    // Work with previous and next
    public void worker(int x){
        // Aux == Display
        this.aux = Integer.parseInt(this.display);
        
        // Display == (Clean)
        this.display = "";
        
        // AuxWorker = 1 | 2 | 3 | 4
        if (x == 1) this.auxWorker = 1;
        if (x == 2) this.auxWorker = 2;
        if (x == 3) this.auxWorker = 3;
        if (x == 4) this.auxWorker = 4;
    }
    
    // Finish work
    public void result(){
        int x = Integer.parseInt(display);

        if (this.auxWorker == 1){
            int r = this.aux + x;
            
            this.resultDisplay = String.valueOf(r);
            this.aux = 0;
            this.display = "";
        }
        if (this.auxWorker == 2){
            int r = this.aux - x;
            
            this.resultDisplay = String.valueOf(r);
            this.aux = 0;
            this.display = "";
        }
        if (this.auxWorker == 3){
            int r = this.aux * x;
            
            this.resultDisplay = String.valueOf(r);
            this.aux = 0;
            this.display = "";
        }
        if (this.auxWorker == 4){
            int r = this.aux / x;
            
            this.resultDisplay = String.valueOf(r);
            this.aux = 0;
            this.display = "";
        }
    }
}