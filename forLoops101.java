public class forLoops101{
  public static void main(String[] args){
    do
    { try
      { I i = new I();
        i.initializeToBeZero();
        for(;true;)
        { System.out.println(i);
          i = i.pp();
          if(Five.checkifequaltofive(i))
          {break;}
          else
          {continue;}
        }
        return;
      } catch(Exception e){}
    }
    while(false);
  }
}
