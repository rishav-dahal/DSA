package Array;

public class Dynamic {
    int size;
    int capacity=8;
    Object[] array;

    //using constructor so array capacity is initalized
    public Dynamic(){
        this.array= new Object[capacity];
    }

    //using parameterized constructor so user can have desired array capacity
    public Dynamic(int capacity){
        this.capacity=capacity;
        this.array= new Object[capacity];
    }

    public void grow(){
        int newcapacity=(int)(capacity*2);
        Object[] newarray=new Object[newcapacity]; //this line will create new array of new capacity
        for(int i=0;i<size;i++){
            newarray[i]=array[i];//this line will copy element of previous array to new array
        }
        capacity=newcapacity;
        array=newarray;
    }

    public  void  shrink(){
        int newcapacity=(int)(capacity/2);
        Object[] newarray=new Object[newcapacity];
        for(int i=0;i<size;i++){
            newarray[i]=array[i];
        }
        capacity=newcapacity;
        array=newarray;
    }

    public void add(Object data){ //this method add new element to end of array
        if(size>=capacity){
           grow();
        }
        array[size]=data;
        size++;
    }

    public void insert(int index,Object data){ //this method add element to desired index
        if(size>=capacity){
          grow();
        }
        for(int i=size;i>index;i--){ //loop to shift the elements to right to make space for new element in desired index
            array[i]=array[i-1];
        }
        array[index]=data;
        size++;
    }

    public void delete(Object data){
        for(int i=0;i<size;i++){ //loop to identify the data and its index
            if(array[i]==data){
                for(int j=0;j<(size-1-i);j++){ //loop to shift elements toward left i.e. it will rewrite the value of next index to the index we want to delete.
                    array[i+j]=array[i+j+1];
                }
                array[size-1]=null;//
                size--;
                if(size<=(int)capacity/3){
                    shrink();
                }
            }
            break;
        }
    }

    public String toString(){ //this method is used to print elements in the array
        String string="";
        for (int i=0;i<size;i++){
            string+=array[i]+", ";
        }
        if(string!=""){
            string="["+string.substring(0,string.length()-2)+"]"; //substring method will take two values i.e. starting index and ending index

        }else{
            string="[]";
        }
        return string;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public Object get(int index){
        return array[index];
    }
    public int search(Object data){
        for(int i=0;i<size;i++){
            if(array[i]==data){
                return i;
            }
        }
        return -1;
    }
}

