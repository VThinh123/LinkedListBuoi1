/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

import java.util.Scanner;


public class LinkedList {
    Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addLast(int data){
        Node NewNode = new Node(data);
        if(head == null){
            head = NewNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = NewNode;
    }
    
    public void printListNode(){
        Node list = head;
        while (list != null){
            System.out.print(list.getData() + "-->");
            list = list.next;

        }      
        System.out.print("null");
    }
    
    public int getNodeByPosition(int index){
        if(index < 0){
            System.out.print("Index must postive number");
            return 0;
        }
        Node temp = head;
        int count = 0;
        while (temp != null){
            if(count == index){
                return temp.getData();
            }
            count++;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList ListNode = new LinkedList();
        //in ra node tu lon toi nho
        ListNode.addFirst(1);
        ListNode.addFirst(2);
        ListNode.addFirst(3);
        ListNode.addFirst(4);
        ListNode.addFirst(5);
        
        // in ra tu nho toi lon
//        ListNode.addLast(1);
//        ListNode.addLast(2);
//        ListNode.addLast(3);
//        ListNode.addLast(4);
//        ListNode.addLast(5);
        
        System.out.println("List node:");
        ListNode.printListNode();

        System.out.print("\nNhap vao vi tri muon biet: ");
        int value = sc.nextInt();
        int result = ListNode.getNodeByPosition(value);
        System.out.println("Value at position " + value + " : " + result);
    }
    
}