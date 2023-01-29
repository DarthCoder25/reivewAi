-- Note:
--   1. All files in this folder will only get evaluated if there is currently no db-metadata files existing. So, when this file executes, we need not explicitly call out to "DROP DATABASE"
--       DROP DATABASE "ecommerce-product-data-ingester";
--   2. The postgres docker image will create the db schema if one doesn't exist at app startup, so no need of explicitly using "CREATE DATABASE" stmt like so
--       CREATE DATABASE "ecommerce-product-data-ingester" owner postgres;
--   3. We need not explicitly call out any specific sql stmt to import any data file. When starting up, all files with the extn ".sql" will be evaluated in alphabetical order (so remember to name them correctly!)
# CREATE USER "reviewUser" WITH PASSWORD 'reviewPassword';
#
# CREATE DATABASE "reviewAIDB";
#
# GRANT ALL PRIVILEGES ON DATABASE "reviewAIDB" TO reviewUser;


