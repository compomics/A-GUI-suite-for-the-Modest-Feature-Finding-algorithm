package com.compomics.moff.gui.view.filter;

import java.io.File;
import javax.swing.filechooser.FileFilter;
import org.apache.commons.io.FilenameUtils;

/**
 * A file filter for tab separated files.
 *
 * @author Niels Hulstaert
 */
public class TabSeparatedFileFilter extends FileFilter {

    private static final String TSV_EXTENSION = "tsv";
    private static final String TAB_EXTENSION = "tsv";
    private static final String DESCRIPTION = "*.tsv, *.tab";

    @Override
    public boolean accept(File file) {
        boolean accept = false;

        if (file.isFile()) {
            String extension = FilenameUtils.getExtension(file.getName());
            if (!extension.isEmpty() && (extension.equals(TSV_EXTENSION) || extension.equals(TAB_EXTENSION))) {
                accept = true;
            }
        } else {
            accept = true;
        }

        return accept;
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

}
