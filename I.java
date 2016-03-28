public final class I extends Number implements Comparable<I>{
  static Integer field;
  
  I(){}
  
  static void initializeToBeZero()
  { field = new Integer("0");
    return;
  }
  
  @Override
  public double doubleValue()
  {return (double)field.intValue();}
  
  @Override
  public float floatValue()
  {return (float)field.intValue();}
  
  @Override
  public long longValue()
  {return (long)field.longValue();}
  
  @Override
  public int intValue()
  {return (int)field.intValue();}
  
  @Override
  public int compareTo(I i2)
  { if(field.intValue() == i2.intValue())
    {return 0;}
    if(field.intValue() > i2.intValue())
    {return 1;}
    if(field.intValue() < i2.intValue())
    {return -1;}
    return Integer.MAX_VALUE;
  }

  public int compareTo(int u)
  { if(field.intValue() == u)
    {return 0;}
    if(field.intValue() > u)
    {return 1;}
    if(field.intValue() < u)
    {return -1;}
    return Integer.MAX_VALUE;
  }

  I pp()
  { I newI = new I();
    newI.makeValueThisNumber(this.intValue() + 1);
    return newI;
  }

  @Override
  public String toString()
  {return "" + this.intValue();}

  private void makeValueThisNumber(int u)
  { this.setValue(u);
    return;
  }

  private void setValue(int u)
  {
    this.field = new Integer(u);
    return;
  }
}
