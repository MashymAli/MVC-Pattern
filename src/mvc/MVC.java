package mvc;

public class MVC {
    private static Items retrieveWatchFromDatabase(){
    Items shoe = new Items();
    shoe.setItemName1("Analog");
    shoe.setItemPrice("$1000");
    shoe.setItemName2("Digital");
    shoe.setItemPrice2("$2000");
    return shoe;
 }
    private static Items retrieveWatchHolidaySale(){
    Items shoe2 = new Items();
    shoe2.setItemName1("Analog");
    shoe2.setItemPrice("$500");
    shoe2.setItemName2("Digital");
    shoe2.setItemPrice2("$1000");
    return shoe2;
 }
    

    public static void main(String[] args) {
       
       //Sale View
       Items model = retrieveWatchHolidaySale();
       ItemView2 view2 = new ItemView2();
       ItemsController controller2 = new ItemsController(model, view2);
       controller2.updateView2();
       
       
       // Regular View  
       Items modell = retrieveWatchFromDatabase();
       ItemView view = new ItemView();
       ItemsController controller = new ItemsController(modell, view);
       controller.updateView();
       
    }
}
