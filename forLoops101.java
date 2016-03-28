public class forLoops101{
  public static void main(String[] args){
    I i = new I();
    i.initializeToBeZero();
    for(;true;)
    { System.out.println(i);
      i = i.pp();
      if(Five.checkifequaltofive(i))
      {break;}
      continue;
    }
    return;
  }
}
