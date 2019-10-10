package model;




import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;

import java.util.Locale;
import java.util.Map;

public class ValuesTransformer implements TypeRegistryConfigurer {

    public Locale locale() {
        return Locale.ENGLISH;
    }

    public void configureTypeRegistry(TypeRegistry typeRegistry) {
        typeRegistry.defineDataTableType(new DataTableType(DataModel.class,
                        (Map<String, String> row) -> {
                            String label = row.get("label");
                            String amount = row.get("amount");

                            return new DataModel(label, amount);
                        }
                )
        );
    }
}
