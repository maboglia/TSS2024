package com.maboglia.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.maboglia.entities.Prodotto;
import com.google.gson.reflect.TypeToken;
@Service
public class ProdottiServiceImpl implements ProdottiService {

	
	
	@Override
	public List<Prodotto> getProdotti() {
		
		
		HttpURLConnection connection = null;
		StringBuilder output = new StringBuilder();
		BufferedReader reader;
		String riga;
		try{
			URL url = new URL("https://fakestoreapi.com/products");
			URL url2 = new URL("https://dummyjson.com/products");
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.setReadTimeout(3000);
			int status = connection.getResponseCode();
			System.out.println("La API di fakestore ha risposto: " + status); 
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while (   (riga = reader.readLine()) != null ) {
				output.append(riga);
			}
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		
		Type listadiprodotti = new TypeToken<List<Prodotto>>(){}.getType();
		List<Prodotto> prodotti = gson.fromJson(output.toString(), listadiprodotti);
		System.out.println(output.toString());
		
		return prodotti;
	}

	@Override
	public Prodotto getProdotto(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Prodotto> getProdottiDummy() {
		
		
		HttpURLConnection connection = null;
		StringBuilder output = new StringBuilder();
		BufferedReader reader;
		String riga;
		try{
//			URL url = new URL("https://fakestoreapi.com/products");
			URL url = new URL("https://dummyjson.com/products");
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.setReadTimeout(3000);
			int status = connection.getResponseCode();
			System.out.println("La API di fakestore ha risposto: " + status); 
			
			reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			while (   (riga = reader.readLine()) != null ) {
				output.append(riga);
			}
			reader.close();
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Gson gson = new Gson();
		
		Map<String, List<Prodotto>> prodotti = gson.fromJson(output.toString(), Map.class);
		
		System.out.println(prodotti.get("products"));

//		Type listadiprodotti = new TypeToken<List<Prodotto>>(){}.getType();
//		List<Prodotto> products = gson.fromJson(prodotti.get("products").toString(), listadiprodotti);
		return prodotti.get("products");
	}

	public static void main(String[] args) {
		ProdottiServiceImpl psi = new ProdottiServiceImpl();
		psi.getProdottiDummy();
	}
	
}
