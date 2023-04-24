package org.example.adapter;

public class CsvAdapter implements TextFormattable{
    CsvFormattable csvFormattable;
    public CsvAdapter(CsvFormattable csvFormattable){
        this.csvFormattable=csvFormattable;
    }
    @Override
    public String formatText(String text) {
        String formattedText = csvFormattable.formatCsvText(text);
        return formattedText;
    }
}
