
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author osmar
 */
@WebServlet(urlPatterns = {"/servlet/ServletCalculadora"})
public class ServletCalculadora extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Calculadora</title></head><body>");
        out.println("<h1>Calculadora</h1>");

        //Recupera os parâmetros
        double valorA = Double.parseDouble(request.getParameter("ValorA"));
        double valorB = Double.parseDouble(request.getParameter("ValorB"));
        double resultado = 0;

        if (request.getParameter("operacao").equals("adicao")) {
            resultado = valorA + valorB;
            out.print("A soma de " + valorA+ " + " + valorB+ " = " + resultado + " <p>");
        } else {
            if (request.getParameter("operacao").equals("subtracao")) {
                resultado = valorA - valorB;
                out.print("A diferen&ccedil;a de " + valorA + " - " + valorB+ " = " + resultado + " <p>");
            } else {
                if (request.getParameter("operacao").equals("multiplicacao")) {
                    resultado = valorA * valorB;
                    out.print("O produto de " + valorA + " * " + valorB + " = " + resultado + " <p>");
                } else {
                    if (request.getParameter("operacao").equals("divisao")) {
                        resultado = valorA / valorB;
                        out.print("O quociente de " + valorA + " / " + valorB + " = " + resultado + " <p>");
                    } else {
                        out.print("Opera&ccedil;&atilde;o inv&aacute;lida! <p>");
                    }
                }
            }
        }

        out.print("<a href=\"" + request.getContextPath() + "/servlet/ServletFrmCalculadora\"> Novo cálculo </a><p>");
        out.println("</body></html>");
        out.close();
    }
}
