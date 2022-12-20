/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socketudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author aluno
 */
public class Servidor {
    public static void main (String[] args){
        
        try{
            DatagramSocket socket = new DatagramSocket(1500);
            System.out.println("Servidor Iniciado!");
            
            
            do{
                byte[] mensagem = new byte[50];
                

                DatagramPacket pacote = new DatagramPacket(mensagem,mensagem.length);
                System.out.println("Esperando mensagem!");
                socket.receive(pacote);

                System.out.println("Fonte: "+ pacote.getAddress().getHostAddress()+"\nMensagem: "+ new String(pacote.getData()));
            }while(true);
        }catch(SocketException e){
            System.out.println("Erro conection!"+e.getMessage());
        }catch(IOException e){
            System.out.println("Erro ao receber a mensagem: "+ e.getMessage());
        }
        
    }
}
