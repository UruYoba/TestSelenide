package suites;

import pages.GooglePage;
import pages.SomePage;

public interface PageObjectSupplier {

    default GooglePage googlePage() {
        return new GooglePage();
    }

    default SomePage somePage() {
        return new SomePage();
    }
}
