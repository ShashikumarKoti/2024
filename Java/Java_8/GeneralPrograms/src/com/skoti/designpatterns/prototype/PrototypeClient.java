package com.skoti.designpatterns.prototype;

public class PrototypeClient {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        System.out.println("Creating object using prototype");

         NetworkConnection networkConnection= new NetworkConnection();
         networkConnection.setIp("1.1.1.1");
         networkConnection.loadHugeData();
         System.out.println(networkConnection);

        NetworkConnection clonedNetworkConnection =(NetworkConnection)networkConnection.clone();
        System.out.println(clonedNetworkConnection);
    }
}
