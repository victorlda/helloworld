

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiroServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest requisicao,
    HttpServletResponse resposta) throws IOException {
        PrintWriter saida = resposta.getWriter();
        Date hoje = new Date();
        saida.println("<html> " +
                      "<body> " +
                      "<h1 alig=center> Nosso Primeiro Servlet </h1>" +
                      "<br/>" + hoje +
                      "</body>" +
                      "</html>");                
    }
}
