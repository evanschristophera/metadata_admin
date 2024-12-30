package com.axient.metadataadmin;

import io.micronaut.http.annotation.*;

@Controller("/metadata-admin")
public class MetadataAdminController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}