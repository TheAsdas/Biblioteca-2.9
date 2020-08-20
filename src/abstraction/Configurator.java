package abstraction;

import panels.ListCreator;

/**
 * This class is used for the configuration of various components.
 *
 * @author Gustavo
 * @version 1.0 29/06/2020
 */
public abstract class Configurator
{

    /**
     * Configures a ListCreator.
     *
     * @param creator Object to configure.
     * @param bannerText String with the component's title.
     * @param labelText String with the component's informative text.
     * @param regex Regular experssion with the component's input condition.
     * @param errorMessage String with the message to show in case of the user
     * inputting something wrong.
     */
    public static void configListCreator (
      ListCreator creator,
      String bannerText,
      String labelText,
      String regex,
      String errorMessage)
    {
        creator.setBannerText ( bannerText );
        creator.setLabelText ( labelText );
        creator.setInputRegex ( regex );
        creator.setErrorMessage ( errorMessage );
    }

}
