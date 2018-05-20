package au.com.prodevelop.c3demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class ChartController {
    @RequestMapping(value = "/api/randomData", method = GET)
    public String randomChartData(@RequestParam("chartCount") int chartCount) {
        List<String> data = new ArrayList<>();

        // For each chart...
        for(int c=1; c <= chartCount; c++) {

            // Generate a line of data
            for(int x=1; x<=96; x++) {
                String record = "{";
                record += "  \"host\": \"Server" + c + "\"";
                record += ", \"count\":" + Double.toString(Math.floor(Math.random() * 100));
                record += ", \"movingAvg\":" + Double.toString(Math.floor(Math.random() * 100));
                record += ", \"std\":" + Double.toString(Math.floor(Math.random() * 100));
                record += ", \"lowerband\":" + Double.toString(Math.floor(Math.random() * 100));
                record += ", \"upperband\":" + Double.toString(Math.floor(Math.random() * 100));
                record += "}";
                data.add( record );
            }

        }
        return data.toString();
    }
}
