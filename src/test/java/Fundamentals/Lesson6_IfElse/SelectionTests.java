package Fundamentals.Lesson6_IfElse;


import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SelectionTests {

    @Test
    public void moreTernary(){
        String url = "www.google.com";

        url = url.startsWith("http") ? url : "http://" + url;

        assertTrue(url.startsWith("http://"));
        assertEquals(url, "http://www.google.com");
    }

    @Test
    public void ifAddHttp(){
        String url = "www.google.com";
        if(!url.startsWith("http")){
            url = "http://" + url;
        }
        assertTrue(url.startsWith("http://"));
        assertEquals(url, "http://www.google.com");

    }

    @Test
    public void ifElseAddHttp(){
        String url = "www.google.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }else{
            url = "http://" + url;
        }
        assertTrue(url.startsWith("http://"));
        assertEquals(url, "http://www.google.com");
    }

    @Test
    public void ifElseNestedAddHttp(){
        String url = "www.google.com";
        if(url.startsWith("http")){
            // do nothing the url is fine
        }else{
            if(!url.startsWith("www")){
                url = "www." + url;
            }
            url = "http://" + url;
        }
        assertTrue(url.startsWith("http://"));
        assertEquals(url, "http://www.google.com");
    }

    @Test
    public void ifElseNestedAddHttpReformatted(){
        String url = "google.com";
        if(url.startsWith("http"))
        {
            // do nothing the url is fine
        }else
        {
            if(!url.startsWith("www"))
            {
                url = "www." + url;
            }
            url = "http://" + url;
        }
        assertTrue(url.startsWith("http://"));
        assertEquals(url, "http://www.google.com");
    }

}