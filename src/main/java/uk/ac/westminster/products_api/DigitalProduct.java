package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    String downloadURL;
    Double fileSizeMB;

    public DigitalProduct(){

    }

    public DigitalProduct(Long id, String name, Double price, String downloadURL, Double fileSizeMB){
        super(id, name,price);
        this.downloadURL = downloadURL;
        this.fileSizeMB = fileSizeMB;
    }

    public String getDownloadURL(){
        return downloadURL;
    }

    public Double getFileSizeMB(){
        return fileSizeMB;
    }

    public void setDownloadURL(String downloadURL){
        this.downloadURL = downloadURL;
    }

    public void setFileSizeMB(Double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }
}
