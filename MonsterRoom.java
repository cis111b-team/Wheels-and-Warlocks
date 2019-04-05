public class MonsterRoom extends DungeonRoom{

   //FIELDS
   private int creatureAmount;
   private Character creatureType;
   
   //CONSTRUCTOR
   MonsterRoom(int amount , Character creature){      //level = Game.getfloorlevel
   
      creatureAmount = amount;
      creatureType = creature;
   
   }

   //METHODS
   public void setCreatureAmount(int amnt){
   
      creatureAmount = amnt;
   
   }
   
   public int getCreatureAmount(){
   
      return creatureAmount;
   
   }
   
   public void setCreatureType(Character creature){
   
      creatureType = creature;
   
   }
   
   public Character getCreatureType(){
   
      return creatureType;
   
   }
   
   public String roomContent(){
   
      String monster = "";
      
      if(this.getFloorLevel() == 3){
      
         monster =  "midboss";
      
      }
      
      else if(this.getFloorLevel() == 6){
      
         monster = "endboss";
      
      }
      
      else{
      
         monster = "goblin";
      
      }
      
      return monster;
   
   }
   
}