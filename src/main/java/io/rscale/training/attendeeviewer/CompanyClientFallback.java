package io.rscale.training.attendeeviewer;

import org.springframework.stereotype.Component;

@Component
public class CompanyClientFallback implements CompanyClient {

    @Override
    public Company getCompany(String companyId) {
        return new Company();
    }
}