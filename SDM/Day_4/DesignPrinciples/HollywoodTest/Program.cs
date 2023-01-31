using System;
using System.Collections.Generic;

// "Don't Call Us, We'll Call You"

namespace HollywoodTest
{
    public class Order 
    {
        public string Product{get;set;}
        public int Quantity{get;set;}
        public string Email{get;set;}
        public string DeliveryLocation{get;set;}
        

        public override  string ToString() {

        return "Order [Title=" + Product + ", Quantity=" + Quantity+ "]";
        }
    }

    public class ECommercePortal {

        private static ECommercePortal portal = new ECommercePortal();
        
        private List<Order> orders = new List<Order>();

        public static ECommercePortal get(){
            return portal;
        }
        
        private ECommercePortal() {}
        
        public void Rquest(String title ,int quantity,string email, string location)
        {
            Order order = new Order();
            order.Product=title;
            order.Quantity=quantity;
            order.Email=email;
            order.DeliveryLocation=location;
            orders.Add(order);
        }
        
        public void TriggerShipment(){
            foreach(Order order in orders)
            {
                Console.WriteLine("Devering Parcel : " + order.Product + " at " + order.DeliveryLocation);
            }
        }
}

    class Program
    {
        static void Main(string[] args)
        {     
            ECommercePortal.get().Rquest("Gerbera", 300, "priya@gmail.com", "Nanded");
            ECommercePortal.get().Rquest("Rose", 1200, "Umesh.sharma@gmail.com","Delhi");
            ECommercePortal.get().Rquest("Lily", 600, "neha.bhor@gmail.com","Manchar");
            ECommercePortal.get().Rquest("Marigold",75000, "aditya.ubale@gmail.com","Kolhapur");
            ECommercePortal.get().Rquest("Lotus", 20, "mayur.kadam@gmail.com","Nashik");   
            
            // Now trigger Shipping
            ECommercePortal.get().TriggerShipment();
        }
    }
}

/*
When ECommerce triggers a shipping Process, 
the  portal/framework sends the mail to all  users  who requested Product Purchase.
*/