class Area {
    int Area(int length, int breadth)
    {
        return (length*breadth);
    }
    int Area(int side){
        return(side*side);
    }
    public static void main(String[] args)
    {
        Area objArea = new Area();
        System.out.println("Area of Rectangle :"+objArea.Area(10, 30));
        System.out.println("Area of Square : "+objArea.Area(2));
        }  
  }