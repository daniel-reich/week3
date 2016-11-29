package com.MyInputOutput.servlets;
        import com.MyInputOutput.entities.$Book;
        import com.MyInputOutput.Data.DataJson;
        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;
        import java.util.ArrayList;

/**
 * Created by Daniel on 11/28/16.
 */
public class Controller2 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String uri = request.getRequestURI();
        System.out.println("Requested URI: "+uri);

        String jspName = uri.substring(uri.lastIndexOf('/')+1);
        System.out.println("JSP Name: "+jspName);


        if (jspName.equalsIgnoreCase("latestBook")) {
            String bookTitle = request.getParameter("booktitle");
            $Book book = DataJson.getBook(bookTitle);
            request.setAttribute("book",book);

        } else if (jspName.equalsIgnoreCase("viewAllBooks")){
            ArrayList<$Book> books = DataJson.getBooks();
            request.setAttribute("books",books);

        } else if (jspName.equalsIgnoreCase("editBook")){
            String bookTitle = request.getParameter("booktitle");
            $Book book = DataJson.getBook(bookTitle);
            request.setAttribute("book",book);

        } else if (jspName.equalsIgnoreCase("updateBook")){
            $Book updateBook = new $Book();
            updateBook.setTitle(request.getParameter("title"));
            updateBook.setAuthor(request.getParameter("author"));
            updateBook.setYearOfPublication(request.getParameter("yearOfPublication"));
            updateBook.setGenre(request.getParameter("genre"));
            jspName="/mvc_cust/latestBook";
        }
System.out.println("here before request dispatcher" + jspName);
        RequestDispatcher view = request.getRequestDispatcher("/"+jspName+".jsp");
        view.forward(request, response);
    }



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request,response);
    }
}
