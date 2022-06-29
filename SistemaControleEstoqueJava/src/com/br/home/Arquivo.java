/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.home;

import com.br.produtos.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author paulo
 */
public class Arquivo {
    
    public void gerarArquivo(String xml){
        PrintWriter print = null;
        
        //Criar diretorio se não tiver
        String pathDir = "C:\\xstream";
            File diretorio = new File(pathDir);
            if(!diretorio.isDirectory()){
                diretorio.mkdir();
            }
        try {
            //Criando e escrevendo arquivo
            
            
            
            File file = new File("C:\\xstream\\produtos.xml");
            print = new PrintWriter(file);
            print.write(xml);
            print.flush();
            print.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            print.close();
        }
    }
    
    
    public void buscaArquivo(){
        try {
            
            FileReader ler = new FileReader("C:\\xstream\\produtos.xml");
            XStream xstream = new XStream(new DomDriver());
            xstream.alias("Produto", Produto.class);
            //Produto prod = (Produto) xstream.fromXML(ler);
            //Object obj = xstream.fromXML(new FileReader("C:\\xstream\\produtos.xml"));
            
            //System.out.println(xstream.fromXML(ler));
            

            
            //Produto produto = (Produto) xstream.fromXML(ler);
            
            //System.out.println(xstream.fromXML(ler));
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
