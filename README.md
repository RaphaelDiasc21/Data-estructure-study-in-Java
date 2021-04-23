* The native kubernetes certificate controller management - cert-manager. It is setting up here by helm, with a further configuration as [cert-manager's official documention recommends](https://cert-manager.io/docs/installation/compatibility/#aws-eks). Regarding that Sensedia service mesh application infrastructure environment is currently supported by AWS.
   * `$ helm repo add jetstack https://charts.jetstack.io` 
   
   -  ```
      $ helm install cert-manager jetstack/cert-manager \
      --namespace cert-manager \
      --version v1.3.1 \
      --create-namespace \
      --set installCRDs=true \
      --set webhook.hostNetwork=true \
      --set webhook.securePort=10251

