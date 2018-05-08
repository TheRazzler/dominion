/**
 * 
 */
package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

import model.*;

/**
 * @author Spencer Yoder
 *
 */
public class DominionServer {
    
    private ServerSocket socket;
    private ArrayList<Socket> clients;
    private ArrayList<PrintWriter> outs;
    private ArrayList<BufferedReader> ins;
    private int[] seeds;
    private int seedIndex;
    
    public static void main(String[] args) {
        Dominion model = new Dominion(new ArrayList<Player>(), 0);
        DominionServer server = new DominionServer();
    }
    
    public DominionServer() {
        try {
            socket = new ServerSocket(4444);
            seeds = new int[50];
            Random r = new Random();
            for(int i = 0; i < 50; i++) {
                seeds[i] = r.nextInt(1000);
            }
        } catch (IOException e) {
            throw new IllegalArgumentException(e.getMessage());
        }
    }
    
    public boolean accept() {
        try {
            Socket s = socket.accept();
            clients.add(s);
            outs.add(new PrintWriter(s.getOutputStream(), true));
            ins.add(new BufferedReader(new InputStreamReader(s.getInputStream())));
            return true;
        } catch (IOException e) {
            return false;
        }
    }
    
    public void broadcast(String s) {
        for(int i = 0; i < clients.size(); i++) {
            outs.get(i).println(s);
        }
    }
    
    public void close() {
        for(int i = 0; i < clients.size(); i++) {
            try {
                outs.get(i).close();
                ins.get(i).close();
            } catch(Exception e) {
                //Do nothing, want to close all input/output streams even if some are null or inaccessible
            }
        }
    }
    
    public int getSeed() {
        if(seedIndex == 50) {
            Random r = new Random();
            for(int i = 0; i < 50; i++) {
                seeds[i] = r.nextInt(1000);
            }
            seedIndex = 0;
        }
        return seeds[seedIndex];
    }
}
