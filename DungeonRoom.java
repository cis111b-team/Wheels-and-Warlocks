public class DungeonRoom{

   //Fields
   private int floorLevel;
   private String floorType;

   //Constructor
   public DungeonRoom(int floorLevelIn){
   
   floorLevel = floorLevelIn;
   floorType = "";
   
   }
   
   //Methods
   public void setFloorLevel( int fl){
   
      floorLevel = fl;
   
   }
   
   public void setFloorType(String floorName){
   
      floorType = floorName;
   
   }
   
   public int getFloorLevel(){
   
      return floorLevel;
   
   }
   
   public String getFloorType(){
   
      return floorType;
   
   }
   
}