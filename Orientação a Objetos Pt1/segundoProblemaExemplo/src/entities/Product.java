package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;


    public double TotalValueInStock(){
        double value =  price*quantity;
        return value;
    }
    public void AddProducts(int quantity){
        this.quantity += quantity;// "this." especifica que a variavel quantity é o elemento da classe e nao o quantity que o metodo recebe como argumento.
    }
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                +" units, Total: $ "
                + String.format("%.2f",TotalValueInStock());

    }
}
