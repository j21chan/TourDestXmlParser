package com.xmlParser.myParser;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class TourDest {
	public String urlBuild() throws UnsupportedEncodingException {
		StringBuilder urlBuilder = new StringBuilder("http://api.visitkorea.or.kr/openapi/service/rest/KorService/detailCommon"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("ServiceKey","UTF-8") + "=lXD74EVz%2B%2BsN6Umj%2FTEiUwe6SrhDlt6EJDw3EiP%2FaQ37jdWZzn2jcv0uMBf90xaYQU2taH9P2nEyEAiiS5mQrw%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("ServiceKey","UTF-8") + "=" + URLEncoder.encode("SERVICE_KEY", "UTF-8")); /*��������*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*�� ������ ��� ��*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*���� ������ ��ȣ*/
        urlBuilder.append("&" + URLEncoder.encode("MobileOS","UTF-8") + "=" + URLEncoder.encode("ETC", "UTF-8")); /*IOS(������),AND(�ȵ���̵�),WIN(��������),ETC*/
        urlBuilder.append("&" + URLEncoder.encode("MobileApp","UTF-8") + "=" + URLEncoder.encode("AppTest", "UTF-8")); /*���񽺸�=���ø�*/
        urlBuilder.append("&" + URLEncoder.encode("contentId","UTF-8") + "=" + URLEncoder.encode("126508", "UTF-8")); /*������ ID*/
        urlBuilder.append("&" + URLEncoder.encode("contentTypeId","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*����Ÿ��(������, ���� ��) ID*/
        urlBuilder.append("&" + URLEncoder.encode("defaultYN","UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*�⺻���� ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("firstImageYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*����, ����� ��ǥ�̹��� ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("areacodeYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*�����ڵ�, �ñ����ڵ� ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("catcodeYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*���񽺺з��ڵ�(��,��,�� �ڵ�) ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("addrinfoYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*�ּ�, ���ּ� ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("mapinfoYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*��ǥ X,Y ��ȸ����*/
        urlBuilder.append("&" + URLEncoder.encode("overviewYN","UTF-8") + "=" + URLEncoder.encode("Y", "UTF-8")); /*������ ���� ��ȸ����*/
        
		return urlBuilder.toString();
	}
}
