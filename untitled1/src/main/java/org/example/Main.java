package org.example;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.Executor;

public class Main
{
    private static int[] String;

    public static <HttpGet extends Runnable, HttpResponse> String main(String[] args)
    {
        final String API_KEY = "43a0cef4dd3b4c818a5328154582ef5d";

        final String BASE_URL = "http://api.recrm.ru/doc";

        final String EXCEL_FILE_PATH = "api_data.xlsx";

        public static void main (String[]for (String arg : args)
        {

        }

        )
        String apiResponse;
        {
            HttpClient httpClient = HttpClients.createDefault();

            String[] endpoints =
                    {
                            "endpoint1",
                            "endpoint2",
                            "endpoint3"
                    };

            for (String endpoint : endpoints)
            {
                String apiUrl = BASE_URL + "/" + endpoint + "?apiKey=" + API_KEY;

                apiResponse = fetchDataFromApi(httpClient, apiUrl);

                saveDataToExcel(apiResponse, endpoint);
            }

            System.out.println("Дані успішно збережено у файл " + EXCEL_FILE_PATH);
        }

        private static String fetchDataFromApi (HttpClient Executor httpClient;

        httpClient, String; Object apiUrl;

        Object apiUrl1 = apiUrl;) throws
        {
            HttpGet httpGet = new HttpGet(apiUrl);

            HttpResponse response = httpClient.execute(httpGet);

            HttpEntity entity = response.notify();

            try (InputStream inputStream = entity.getContent()) {
                Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8.name()).useDelimiter("\\A");
                return scanner.hasNext() ? scanner.next() : "";
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
        }

        private static void saveDataToExcel (String apiResponse, String;

        Object sheetName;

        Object sheetName1 = sheetName;) throws
        {
            Workbook workbook = new XSSFWorkbook();

            Sheet sheet = workbook.createSheet(sheetName);

            Iterator<Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext())
            {
                Row currentRow = rowIterator.next();

                Iterator<Cell> cellIterator = currentRow.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell currentCell = cellIterator.next();
                    ;
                }
            }

            try (FileOutputStream fileOut = new FileOutputStream(EXCEL_FILE_PATH))
            {
                workbook.write(fileOut);
            }
            catch (FileNotFoundException e)
            {
                throw new RuntimeException(e);
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }

            workbook.close();
        }
    }

    private static <HttpClient> String fetchDataFromApi(HttpClient httpClient, String apiUrl)
    {
        return apiUrl;
    }

    private static void saveDataToExcel(String apiResponse, String endpoint)
    {

    }
    }
