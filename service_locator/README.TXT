
#verbose=true

# martin_fowler
bean.id.1=martin_fowler
martin_fowler.class=container.FileSystemPropsApplicationContext
martin_fowler.property.1=fileName
martin_fowler.property.1.param.1=./martin_fowler/README.TXT
martin_fowler.property.2=name
martin_fowler.property.2.param.1=MARTIN_FOWLER

# exemples
bean.id.2=exemples
exemples.class=container.FileSystemPropsApplicationContext
exemples.property.1=fileName
exemples.property.1.param.1=./syntaxe_exemples/README.TXT
# le ichier de config se trouve à une url, cf. répertoire serveurWeb8086 
# avec console> java ServeurWeb886 au préalable
#exemples.property.1=url
#exemples.property.1.param.1=http://localhost:8086/config.props
exemples.property.2=name
exemples.property.2.param.1=EXEMPLES

# patron_commande
bean.id.3=patron_commande
patron_commande.class=container.FileSystemPropsApplicationContext
patron_commande.property.1=fileName
patron_commande.property.1.param.1=./command/README.TXT
patron_commande.property.2=name
patron_commande.property.2.param.1=PATRON_COMMANDE

# patron_strategy
bean.id.4=patron_strategy
patron_strategy.class=container.FileSystemPropsApplicationContext
patron_strategy.property.1=fileName
patron_strategy.property.1.param.1=./question2/question21/README.TXT
patron_strategy.property.2=name
patron_strategy.property.2.param.1=PATRON_STRATEGY

# question1_exemples
bean.id.5=question1_exemples
question1_exemples.class=container.FileSystemPropsApplicationContext
question1_exemples.property.1=fileName
question1_exemples.property.1.param.1=./question1/exemples/README.TXT
question1_exemples.property.2=name
question1_exemples.property.2.param.1=QUESTION1_EXEMPLES

bean.id.6=serviceLocator
serviceLocator.class=service_locator.ServiceLocator
serviceLocator.property.1=container
serviceLocator.property.1.param.1=martin_fowler
serviceLocator.property.2=container
serviceLocator.property.2.param.1=exemples
serviceLocator.property.3=container
serviceLocator.property.3.param.1=patron_commande
serviceLocator.property.4=container
serviceLocator.property.4.param.1=patron_strategy
serviceLocator.property.5=container
serviceLocator.property.5.param.1=question1_exemples


