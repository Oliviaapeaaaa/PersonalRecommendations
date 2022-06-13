package rpc;

import db.DBConnection;
import db.DBConnectionFactory;
import entity.Item;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@WebServlet(urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("user_id");
        double lat = Double.parseDouble(request.getParameter("lat"));
        double lon = Double.parseDouble(request.getParameter("lon"));
        // Term can be empty or null.
        String term = request.getParameter("term");

      DBConnection connection = DBConnectionFactory.getConnection();
        List<Item> items = connection.searchItems(lat, lon, term);
        connection.close();

        Set<String> favorite = connection.getFavoriteItemIds(userId);
        connection.close();



        List<JSONObject> list = new ArrayList<>();
        try {
            for (Item item : items) {
                // Add a thin version of item object
                JSONObject obj = item.toJSONObject();
                obj.put("favorite", favorite.contains(item.getItemId()));
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        JSONArray array = new JSONArray(list);
        RpcHelper.writeJsonArray(response, array);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
