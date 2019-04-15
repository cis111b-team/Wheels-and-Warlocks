import java.util.Random;

public class TreasureRoom extends DungeonRoom{

   //FIELDS
   private int rewardGold;
   private Item rewardItem;
   private String roomText;
   Random random = new Random();
   
   //CONSTRUCTOR
   TreasureRoom(){
      
      rewardGold = random.nextInt(6,20);
      //rewardItem = Interface w/ database
   
   }
   
   public void setRewardGold(int gold){
   
      rewardGold = gold;
   
   }
   
   //setRewardItem

}