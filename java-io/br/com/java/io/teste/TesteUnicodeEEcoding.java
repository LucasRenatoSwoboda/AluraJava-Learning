package br.com.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEcoding {

	public static void main(String[] args) throws UnsupportedEncodingException {

		//
		String s = "ç";
		System.out.println(s.codePointAt(0));
		
		//
		Charset charset = Charset.defaultCharset();
		System.out.println(charset.displayName());

		//
		byte[] bytes = s.getBytes("Windows-1252");
		System.out.print(bytes.length + " Windows-1252 ");
		String sNew = new String(bytes, "Windows-1252");
		System.out.println(sNew);

		//
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length + " UTF-16 ");
		sNew = new String(bytes, "UTF-16");
		System.out.println(sNew);

		//
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length + " ASCII ");
		sNew = new String(bytes, "ASCII");
		System.out.println(sNew);

	}

}
