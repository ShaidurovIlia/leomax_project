package restAssured.tests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class SalesModelResponse {
    private String name;
    private String code;
    private String sort;
    private String created_at;
    private String updated_at;
    private String indexed_at;
    private String active_to;
    private String active_from;
    private String id;
    private SeoData seo_data;
}

@NoArgsConstructor
@AllArgsConstructor
@Data
class SeoData {
    private String seo_text;
    private String description;
    private String h1;
    private String title;
}