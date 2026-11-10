insert into management_users (
     organization_id, role_id, username, password_hash, enabled,created_at, updated_at
)

select NULL,roles.id,'platform-admin',
       '$2b$12$4lAv2oZkY2kXQJ4yxxIS2OLM2jIRKQsA/G/0TiaE/6kl2b6iuYasC',
       TRUE,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP
from roles where roles.name = 'PLATFORM_ADMIN';

insert into management_users(
    organization_id, role_id, username, password_hash, enabled, created_at, updated_at
)
select NULL,roles.id,'gateway-service',
       '$2b$12$Sbftb0VMSRDTHHbIfnkP0uAswD3SIGeaRpSVmjPoa9kJDNUyDgPTe',
       TRUE,CURRENT_TIMESTAMP,CURRENT_TIMESTAMP
from roles where roles.name='GATEWAY_SERVICE';