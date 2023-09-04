package com.haceb.models;

import com.haceb.utils.EscrituraExcel;
import com.haceb.utils.Excel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class ExcelServices {

    public static final String HOJA_USUARIOS_HACEB = "datos";

    public static void EscrituraExcel(String texto, Integer fila, Integer columna){
        EscrituraExcel.escrituraExcel(Excel.RUTA_EXCEL_HACEB,texto, fila, columna);
    }

    public static ArrayList<Map<String, String>> leerDatos(String hoja){
        ArrayList<Map<String, String>> datos = new ArrayList<>();
        try {
            datos = Excel.leerDatosDeHojaDeExcel(Excel.RUTA_EXCEL_HACEB, hoja);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return datos;
    }
}
