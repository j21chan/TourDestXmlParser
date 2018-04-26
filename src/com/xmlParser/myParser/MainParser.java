//1. URL ���� �� �˻����� �����
//2. �� ������ ���� �ļ��� �����
//3. �ļ����� ������ ��ü�� �����ϵ��� �����


package com.xmlParser.myParser;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class MainParser {
	public static void main(String[] args) {
		 
        try{
            new MainParser().start();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
 
    private void start() throws Exception{

    	URL url = new URL("http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaBasedList?ServiceKey=lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D&contentTypeId=12&areaCode=1&sigunguCode=&cat1=A02&cat2=A0203&cat3=A02030400&listYN=Y&MobileOS=ETC&MobileApp=TourAPI3.0_Guide&arrange=A&numOfRows=12&pageNo=1");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-type", "application/json");
        
        Document doc = parseXML(connection.getInputStream());
        NodeList descNodes = doc.getElementsByTagName("item");
        
        for(int i=0; i<descNodes.getLength();i++){
 
            for(Node node = descNodes.item(i).getFirstChild(); node!=null; node=node.getNextSibling()){ //ù��° �ڽ��� �������� ���������� ���� ������ ����
 
                if(node.getNodeName().equals("addr1")){
                	System.out.print("addr1: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("addr2")){
                	System.out.print("addr2: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("areacode")){
                	System.out.print("areaCode: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("cat1")){
                	System.out.print("cat1: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("cat2")){
                	System.out.print("cat2: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("cat3")){
                	System.out.print("cat3: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("contentid")){
                	System.out.print("content id: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("contenttypeid")){
                	System.out.print("content type id: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("createdtime")){
                	System.out.print("created time: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("mapx")){
                	System.out.print("map x: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("mapy")){
                	System.out.print("mapy: ");
                    System.out.println(node.getTextContent());
                }else if(node.getNodeName().equals("tel")){
                	System.out.print("tel: ");
                    System.out.println(node.getTextContent());
                } else if(node.getNodeName().equals("title")){
                	System.out.print("title: ");
                    System.out.println(node.getTextContent());
                }
            }
            System.out.println("");
        }
                        
    }
 
    private Document parseXML(InputStream stream) throws Exception {
 
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
 
        try{
 
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
 
            doc = objDocumentBuilder.parse(stream);
 
        }catch(Exception ex){
            throw ex;
        }       
 
        return doc;
    }
}
